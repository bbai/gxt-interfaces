package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.form.FormPanel;

import gxt.visual.ui.client.interfaces.presenter.IFormPanelPresenter;
import gxt.visual.ui.client.interfaces.view.IFormPanelView;

/**
 * @author eugenp
 */
public interface IFormPanel extends IContentPanel, IFormPanelView, IFormPanelPresenter{
	
	/** mine */
	FormPanel getComponent();

}
