package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ITabPanelPresenter;
import gxt.visual.interfaces.view.ITabPanelView;

import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;

/**
 * @author eugenp
 */
public interface ITabPanel extends IContainer< TabItem >, ITabPanelView, ITabPanelPresenter{

	/** mine */
	TabPanel getComponent();

}
