package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IComboBoxPresenter;
import gxt.visual.ui.client.interfaces.view.IComboBoxView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.ComboBox;

/**
 * @author eugenp
 */
public interface IComboBox< D extends ModelData > extends ITriggerField< D >, IComboBoxView< D >, IComboBoxPresenter< D >{
	
	/** mine */
	ComboBox< D > getComponent();

}
