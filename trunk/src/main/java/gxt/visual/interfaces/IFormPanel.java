package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.FormPanel;

import gxt.visual.interfaces.presenter.IFormPanelPresenter;
import gxt.visual.interfaces.view.IFormPanelView;

/**
 * @author eugenp
 */
public interface IFormPanel extends IContentPanel, IFormPanelView, IFormPanelPresenter{
	
	/** mine */
	FormPanel getComponent();

}
