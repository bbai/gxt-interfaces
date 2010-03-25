package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IMultiFieldPresenter;
import gxt.client.visual.interfaces.view.IMultiFieldView;

import com.extjs.gxt.ui.client.widget.form.MultiField;

/**
 * @author eugenp
 */
public interface IMultiField< D > extends IField< D >, IMultiFieldView< D >, IMultiFieldPresenter< D >{
	
	/** mine */
	MultiField< D > getComponent();

}
