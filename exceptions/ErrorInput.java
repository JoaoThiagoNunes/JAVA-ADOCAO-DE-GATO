package exceptions;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ErrorInput extends JPanel  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void exibirMensagemError(String mensagem) {
	    JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	

}
