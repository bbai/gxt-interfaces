package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ITabPanelPresenter;
import gxt.client.visual.interfaces.view.ITabPanelView;

import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;

/**
 * @author eugenp
 */
public interface ITabPanel extends IContainer< TabItem >, ITabPanelView, ITabPanelPresenter{

	/** mine */
	TabPanel getComponent();

}
