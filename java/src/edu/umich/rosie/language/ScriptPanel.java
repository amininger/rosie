package edu.umich.rosie.language;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

import edu.umich.rosie.language.LanguageConnector.MessageType;

@SuppressWarnings("serial")
public class ScriptPanel extends JPanel{
	
	private ChatPanel chat;

	private String[] script;
	private Integer scriptIndex = 0;

	private DefaultListModel listModel;
	private JList messagesList;
	private JScrollPane scrollPane;

	private JButton advanceBtn;
	private JButton skipBtn;

	public ScriptPanel(ChatPanel chat){
		this.chat = chat;
		this.script = new String[]{};

		initPanel();
	}

	public void loadScriptFile(String filename){
		ArrayList<String> messages = new ArrayList<String>();
		if(filename != null){
			try{
				BufferedReader br = new BufferedReader(new FileReader(filename));
				try {
					String line = br.readLine();
					while(line != null){
						messages.add(line);
						line = br.readLine();
					}
				} finally {
				    br.close();
				}
			} catch(IOException e){
				System.err.println("InstructorMessagePanel: Failed to read file " + filename);
			}
		}
		script = messages.toArray(new String[messages.size()]);
		scriptIndex = 0;
		listModel.clear();
		for(String s : script){
			listModel.addElement(s);
		}
		if(script.length > 0){
			messagesList.setSelectedIndex(0);
		}

		//initPanel();
	}
	
	private void initPanel(){
		this.setLayout(new GridBagLayout());
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.BOTH;
		cons.weightx = 1;
		cons.gridx = 0;

		listModel = new DefaultListModel();
		messagesList = new JList(listModel);
		scrollPane = new JScrollPane(messagesList);
		cons.weighty = 1;
		this.add(scrollPane, cons);

		advanceBtn = new JButton("Advance");
		advanceBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(scriptIndex >= script.length){
					return;
				}
				String message = script[scriptIndex];
				if(message.startsWith("#")){
					chat.getMessageLogger().sendMessage(message, MessageType.AGENT_MESSAGE);
				} else {
					chat.getMessageLogger().sendMessage(message, MessageType.INSTRUCTOR_MESSAGE);
				}
				loadNextMessage();
			}
		});
		cons.weighty = 0;
		this.add(advanceBtn, cons);

		skipBtn = new JButton("Skip");
		skipBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				loadNextMessage();
			}
		});
		this.add(skipBtn, cons);

	}

	private void loadNextMessage(){
		scriptIndex += 1;
		if(scriptIndex < script.length){
			messagesList.setSelectedIndex(scriptIndex);
			scrollPane.getViewport().setViewPosition(
					messagesList.indexToLocation(scriptIndex));
		}
	}
	
	//public void addMessage(String message){
	//	if(!messages.containsKey(message)){
	//		JButton button = new JButton(message);
	//		button.setMinimumSize(new Dimension(600, 50));
	//		button.addActionListener(new ActionListener(){
	//			public void actionPerformed(ActionEvent arg0) {
	//				sendMessage(((JButton)arg0.getSource()).getText());
	//			}
	//		});
	//		this.add(button);
	//	}
	//}
	//
	//public void removeMessage(String message){
	//	if(messages.containsKey(message)){
	//		this.remove(messages.get(message));
	//		messages.remove(message);
	//	}
	//}
	//
	//private void sendMessage(String message){
	//	chat.getMessageLogger().sendMessage(message, MessageType.INSTRUCTOR_MESSAGE);
	//}
}
