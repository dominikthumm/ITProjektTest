package de.hdm.client;

import de.hdm.client.gui.EditorPanel;
import de.hdm.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sun.java.swing.plaf.windows.resources.windows;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AIT2 implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		RootPanel.get().add(new EditorPanel());
		
	/*	
		VerticalPanel vp = new VerticalPanel();
		
		Label l  =new Label("wenn du etwas in die Textbox schreibst und anschlie�end auf KLICK MICH DRUECKST, kannst du dein blaues Wunder erleben !!!!");
		vp.add(l);qwf
		
		
		TextBox tb  = new TextBox();
		vp.add(tb);
		
		
		Button b = new Button("klick mich");
		b.addClickHandler(new ButtonClickHandler());
		vp.add(b);
		
		
		
		RootPanel.get().add(vp);
		
	}

	//Kommentar 22233333
		

		
	private class ButtonClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			//Window.alert("du hast mich gefickt");
			DialogBox db = new DialogBox();
			db.setText("hast mich angeklickt du Masthuhn");
			db.setModal(false);
			db.show();
			
		} */
		
		}
	}
	
	
