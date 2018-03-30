package com.nvlad.yii2support.migrations.actions;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.AnActionButton;
import com.nvlad.yii2support.migrations.ui.MigrationPanel;

public class RefreshAction extends AnActionButton {
    public RefreshAction() {
        super("Refresh migrations", AllIcons.Actions.Refresh);
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        ((MigrationPanel) getContextComponent()).updateMigrations();
    }

    @Override
    public boolean displayTextInToolbar() {
        return false;
    }
}
