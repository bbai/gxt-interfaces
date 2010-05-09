package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IMultiFieldPresenter;
import gxt.visual.ui.client.interfaces.view.IMultiFieldView;

import com.extjs.gxt.ui.client.widget.form.MultiField;

/**
 * @author eugenp
 */
public interface IMultiField< D > extends IField< D >, IMultiFieldView< D >, IMultiFieldPresenter< D >{
	
	/** mine */
	MultiField< D > getComponent();

}
