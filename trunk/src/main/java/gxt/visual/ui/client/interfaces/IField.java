package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IFieldPresenter;
import gxt.visual.ui.client.interfaces.view.IFieldView;

import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public interface IField< D > extends IBoxComponent, IFieldView< D >, IFieldPresenter< D >{
	
	/** mine */
	Field< D > getComponent();

}
