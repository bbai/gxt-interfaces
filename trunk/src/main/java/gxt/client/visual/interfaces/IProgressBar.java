package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.ProgressBar;

import gxt.client.visual.interfaces.presenter.IProgressBarPresenter;
import gxt.client.visual.interfaces.view.IProgressBarView;

/**
 * @author eugenp
 */
public interface IProgressBar extends IBoxComponent, IProgressBarView, IProgressBarPresenter{
	
	/** mine */
	ProgressBar getComponent();

}
