package com.inventory;

import java.util.List;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class DashboardController {
  @FXML
  private Label sales;
  @FXML
  private Label sRevenue;
  @FXML
  private Label spent;
  @FXML
  private Label profit;
  @FXML
  private Label purchase;
  @FXML
  private Label returns;
  @FXML
  private Label pCost;
  @FXML
  private Label cancelled;
  @FXML
  private Label totalStock;
  @FXML
  private Label hstockItem;
  @FXML
  private Label lstockItem;
  @FXML
  private Label expired;
  @FXML
  private Label totalVendor;
  @FXML
  private Label totalCustomers;
  @FXML
  private Label totalSuppliers;

  public void initialize() {

    Platform.runLater(() -> {
      updateDashboard();
    });

  }

  public void updateDashboard() {
    sales.setText(String.valueOf(IssuedGoodsController.getSales()));
    sRevenue.setText(String.valueOf(IssuedGoodsController.getRevenue()));
    double _amountSpent = InventoryController.getAmountSpent();
    double _totalCost = IssuedGoodsController.getTotalCost();
    spent.setText(String.valueOf(_amountSpent));
    profit.setText(String.valueOf(IssuedGoodsController.getRevenue() - _amountSpent));
    cancelled.setText("0");
    returns.setText(String.valueOf(IssuedGoodsController.getRevenue() - _totalCost));
    pCost.setText(String.valueOf(_totalCost));
    purchase.setText(String.valueOf(IssuedGoodsController.getSales()));
    sRevenue.setText(String.valueOf(IssuedGoodsController.getRevenue()));
    totalStock.setText(String.valueOf(InventoryController.getTotalStock()));
    hstockItem.setText(String.valueOf(InventoryController.getHighStockedItem()));
    lstockItem.setText(String.valueOf(InventoryController.getLowStockedItem()));
    expired.setText(String.valueOf(InventoryController.getTotalExpiredItems()));
    totalVendor.setText(String.valueOf(VendorsController.getTotalVendors()));
    totalCustomers.setText(String.valueOf(IssuedGoodsController.getTotalCustomers()));
    totalSuppliers.setText(String.valueOf(VendorsController.getTotalVendors()));
  }
}
