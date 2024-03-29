package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IListFieldPresenter;
import gxt.visual.ui.client.interfaces.view.IListFieldView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.ListField;

/**
 * @author eugenp
 */
public interface IListField< D extends ModelData > extends IField< D >, IListFieldView< D >, IListFieldPresenter< D >{
	
	/** mine */
	ListField< D > getComponent();

}
