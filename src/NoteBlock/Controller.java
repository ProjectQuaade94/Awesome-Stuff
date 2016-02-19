package NoteBlock;

	import javax.swing.JOptionPane;

	public class Controller {

		private boolean loop = true;
		private int response = -1;
		private String[] choices = {"New Note","New Number","View Notes"};
		private String message;

		
		public void programLoop(){

			while (loop) {
				message = "Welcome to Note Block!\n\n- Designed and created by Lars Quaade\n\n";
				response = JOptionPane.showOptionDialog(
						null                         // Center in window.
						, message			         // Message
						, "Note Block"      // Title in titlebar
						, JOptionPane.YES_NO_OPTION  // Option type
						, JOptionPane.PLAIN_MESSAGE  // messageType
						, null                       // Icon (none)
						, choices                    // Button text as above.
						,JOptionPane.YES_OPTION  						 // Default button's label
						);
			
		        if (response == JOptionPane.CLOSED_OPTION) {
		        	System.exit(0);
		        }
				if (response == 0){
					NewNote.newNote();
				}
				if (response == 1){
					NewNote.newNumber();
				}
				if (response == 2){
					ViewNotes.viewNotes();
				}
			}
		}
	}


