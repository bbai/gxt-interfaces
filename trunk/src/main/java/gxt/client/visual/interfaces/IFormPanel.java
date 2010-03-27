package gxt.client.visual.interfaces;

import java.util.List;

import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.FormPanel.Encoding;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;
import com.extjs.gxt.ui.client.widget.form.FormPanel.Method;

/**
 * Note: the IResetable and
 * @author eugenp
 */
public interface IFormPanel extends IContentPanel{
	
	void setFieldWidth( final int fieldWidth );
	
	void setLabelAlign( final LabelAlign align );
	void setLabelWidth( final int labelWidth );
	
	void clear();

	void reset(); // TODO: implement IResetable instead
	boolean isValid();
	
	void submit();
	
	void setAction( final String url );
	String getAction();
	
	void setMethod( final Method method );
	Method getMethod();
	
	void setEncoding( final Encoding encoding );
	Encoding getEncoding();
	
	List< Field< ? >> getFields();
	
	void setReadOnly( boolean b );
	
}
