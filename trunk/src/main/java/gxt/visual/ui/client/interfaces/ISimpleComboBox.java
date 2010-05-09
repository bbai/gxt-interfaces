package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ISimpleComboBoxPresenter;
import gxt.visual.ui.client.interfaces.view.ISimpleComboBoxView;

import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.SimpleComboValue;

/**
 * @author eugenp
 */
public interface ISimpleComboBox< T > extends IComboBox< SimpleComboValue< T > >, ISimpleComboBoxView< T >, ISimpleComboBoxPresenter< T >{
	
	/** mine */
	SimpleComboBox< T > getComponent();

}
