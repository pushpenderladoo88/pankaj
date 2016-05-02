package net.pankaj.action;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import net.pankaj.jdbc.DataAccess;

public class PieChart extends HttpServlet {
        private static final long serialVersionUID = 1L;
        private Connection dbConnection = null;

        public PieChart() {
                dbConnection = DataAccess.getConnection();
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        JDBCCategoryDataset dataset = new JDBCCategoryDataset(dbConnection);

        try {
        dataset.executeQuery("SELECT source,percentage FROM air_pollution ORDER BY percentage");

        JFreeChart chart = ChartFactory.createBarChart(
               "air", "source", "percentage",
               dataset, PlotOrientation.VERTICAL, false, true, false);           
               chart.setBorderVisible(true);

        if (chart != null) {
                int width = 600;
                int height = 400;
                response.setContentType("image/jpeg");
                OutputStream out = response.getOutputStream();
                ChartUtilities.writeChartAsJPEG(out, chart, width, height);
        }
        }
        catch (SQLException e) {
                System.err.println(e.getMessage());
        }
        }

}

