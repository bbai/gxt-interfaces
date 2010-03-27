package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.CardPanel;
import gxt.client.visual.interfaces.presenter.ICardPanelPresenter;
import gxt.client.visual.interfaces.view.ICardPanelView;

/**
 * @author eugenp
 */
public interface ICardPanel extends ILayoutContainer, ICardPanelView, ICardPanelPresenter{
	
	/** mine */
	CardPanel getComponent();

}
