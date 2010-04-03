package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IListFieldPresenter;
import gxt.client.visual.interfaces.view.IListFieldView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.ListField;

/**
 * @author eugenp
 */
public interface IListField< D extends ModelData > extends IField< D >, IListFieldView< D >, IListFieldPresenter< D >{
	
	/** mine */
	ListField< D > getComponent();

}
