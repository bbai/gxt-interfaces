package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IContentPanelPresenter;
import gxt.visual.ui.client.interfaces.view.IContentPanelView;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.IconSupport;

/**
 * @author eugenp
 */
public interface IContentPanel extends ILayoutContainer, IContentPanelView, IContentPanelPresenter, IconSupport{
	
	/** mine */
	ContentPanel getComponent();

}
