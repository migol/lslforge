package lslforge.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;

public class LSLForgeReconcilingStrategy implements IReconcilingStrategy {

    private LSLForgeEditor editor;

    public LSLForgeReconcilingStrategy(LSLForgeEditor editor) {
        this.editor = editor;
    }
    
    public void reconcile(IRegion partition) {
        editor.updateOutline();
    }

    public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
        editor.updateOutline();
    }

    public void setDocument(IDocument document) {
        editor.updateOutline();
    }

    
}
