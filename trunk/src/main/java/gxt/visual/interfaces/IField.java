package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IFieldPresenter;
import gxt.visual.interfaces.view.IFieldView;

import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public interface IField< D > extends IBoxComponent, IFieldView< D >, IFieldPresenter< D >{
	
	/** mine */
	Field< D > getComponent();

}
