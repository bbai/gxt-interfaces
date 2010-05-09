package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IVerticalPanelPresenter;
import gxt.visual.ui.client.interfaces.view.IVerticalPanelView;

import com.extjs.gxt.ui.client.widget.VerticalPanel;

/**
 * @author eugenp
 */
public interface IVerticalPanel extends ILayoutContainer, IVerticalPanelView, IVerticalPanelPresenter{
	
	/** mine */
	VerticalPanel getComponent();

}
