package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IVerticalPanelPresenter;
import gxt.client.visual.interfaces.view.IVerticalPanelView;

import com.extjs.gxt.ui.client.widget.VerticalPanel;

/**
 * @author eugenp
 */
public interface IVerticalPanel extends ILayoutContainer, IVerticalPanelView, IVerticalPanelPresenter{
	
	/** mine */
	VerticalPanel getComponent();

}
