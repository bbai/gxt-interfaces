package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IContentPanelPresenter;
import gxt.visual.interfaces.view.IContentPanelView;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.IconSupport;

/**
 * @author eugenp
 */
public interface IContentPanel extends ILayoutContainer, IContentPanelView, IContentPanelPresenter, IconSupport{
	
	/** mine */
	ContentPanel getComponent();

}
