package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IFieldPresenter;
import gxt.client.visual.interfaces.view.IFieldView;

import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public interface IField< D > extends IBoxComponent, IFieldView< D >, IFieldPresenter< D >{
	
	/** mine */
	Field< D > getComponent();

}
