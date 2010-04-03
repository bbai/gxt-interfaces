package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IContentPanelPresenter;
import gxt.client.visual.interfaces.view.IContentPanelView;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.IconSupport;

/**
 * @author eugenp
 */
public interface IContentPanel extends ILayoutContainer, IContentPanelView, IContentPanelPresenter, IconSupport{
	
	/** mine */
	ContentPanel getComponent();

}
