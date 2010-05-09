package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ITextAreaPresenter;
import gxt.visual.ui.client.interfaces.view.ITextAreaView;

import com.extjs.gxt.ui.client.widget.form.TextArea;

/**
 * @author eugenp
 */
public interface ITextArea extends ITextField< String >, ITextAreaView, ITextAreaPresenter{
	
	/** mine */
	TextArea getComponent();
	
}
