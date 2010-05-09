package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IMultiFieldPresenter;
import gxt.visual.interfaces.view.IMultiFieldView;

import com.extjs.gxt.ui.client.widget.form.MultiField;

/**
 * @author eugenp
 */
public interface IMultiField< D > extends IField< D >, IMultiFieldView< D >, IMultiFieldPresenter< D >{
	
	/** mine */
	MultiField< D > getComponent();

}
