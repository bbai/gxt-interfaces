package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.FormPanel;

import gxt.client.visual.interfaces.presenter.IFormPanelPresenter;
import gxt.client.visual.interfaces.view.IFormPanelView;

/**
 * @author eugenp
 */
public interface IFormPanel extends IContentPanel, IFormPanelView, IFormPanelPresenter{
	
	/** mine */
	FormPanel getComponent();

}
