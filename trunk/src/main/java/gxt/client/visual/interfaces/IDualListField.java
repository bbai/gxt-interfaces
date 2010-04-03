package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IDualListFieldPresenter;
import gxt.client.visual.interfaces.view.IDualListFieldView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.DualListField;
import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public interface IDualListField< D extends ModelData > extends IMultiField< Field< ? > >, IDualListFieldView< D >, IDualListFieldPresenter< D >{
	
	/** mine */
	DualListField< D > getComponent();

}
