package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ITriggerFieldPresenter;
import gxt.visual.ui.client.interfaces.view.ITriggerFieldView;

import com.extjs.gxt.ui.client.widget.form.TriggerField;

/**
 * @author eugenp
 */
public interface ITriggerField< D > extends ITextField< D >, ITriggerFieldView< D >, ITriggerFieldPresenter< D >{
	
	/** mine */
	TriggerField< D > getComponent();

}
