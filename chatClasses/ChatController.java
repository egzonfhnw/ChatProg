package chatClasses;


import abstractChatClasses.Controller;

public class ChatController extends Controller<ChatModel, ChatView> {

	public ChatController(ChatModel model, ChatView view) {
		super(model, view);
		
	}

}