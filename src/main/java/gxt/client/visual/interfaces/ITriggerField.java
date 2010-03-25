package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ITriggerFieldPresenter;
import gxt.client.visual.interfaces.view.ITriggerFieldView;

import com.extjs.gxt.ui.client.widget.form.TriggerField;

/**
 * @author eugenp
 */
public interface ITriggerField< D > extends ITextField< D >, ITriggerFieldView< D >, ITriggerFieldPresenter< D >{
	
	/** mine */
	TriggerField< D > getComponent();

}
