package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IVerticalPanelPresenter;
import gxt.visual.interfaces.view.IVerticalPanelView;

import com.extjs.gxt.ui.client.widget.VerticalPanel;

/**
 * @author eugenp
 */
public interface IVerticalPanel extends ILayoutContainer, IVerticalPanelView, IVerticalPanelPresenter{
	
	/** mine */
	VerticalPanel getComponent();

}
