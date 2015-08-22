

package br.com.view;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Aluno
 */
public class TeclasPermitidas extends PlainDocument{
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^A-Z] , [^0-9]",""), attr);
    }
    
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^A-Z] , [^0-9]",""), attr);
    }
    
}
