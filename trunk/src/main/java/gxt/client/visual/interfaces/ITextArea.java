package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ITextAreaPresenter;
import gxt.client.visual.interfaces.view.ITextAreaView;

import com.extjs.gxt.ui.client.widget.form.TextArea;

/**
 * @author eugenp
 */
public interface ITextArea extends ITextField< String >, ITextAreaView, ITextAreaPresenter{
	
	/** mine */
	TextArea getComponent();
	
}
