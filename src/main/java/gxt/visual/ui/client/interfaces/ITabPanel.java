package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ITabPanelPresenter;
import gxt.visual.ui.client.interfaces.view.ITabPanelView;

import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;

/**
 * @author eugenp
 */
public interface ITabPanel extends IContainer< TabItem >, ITabPanelView, ITabPanelPresenter{

	/** mine */
	TabPanel getComponent();

}
