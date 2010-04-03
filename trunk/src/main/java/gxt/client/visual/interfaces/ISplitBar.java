package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.SplitBar;

import gxt.client.visual.interfaces.presenter.ISplitBarPresenter;
import gxt.client.visual.interfaces.view.ISplitBarView;

/**
 * @author eugenp
 */
public interface ISplitBar extends IBoxComponent, ISplitBarView, ISplitBarPresenter{
	
	/** mine */
	SplitBar getComponent();

}
