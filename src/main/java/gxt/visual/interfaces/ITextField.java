package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ITextFieldPresenter;
import gxt.visual.interfaces.view.ITextFieldView;

import com.extjs.gxt.ui.client.widget.form.TextField;

/**
 * @author eugenp
 */
public interface ITextField< D > extends IField< D >, ITextFieldView< D >, ITextFieldPresenter< D >{
	
	/** mine */
	TextField< D > getComponent();

}
