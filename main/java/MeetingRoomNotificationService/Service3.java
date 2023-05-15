package MeetingRoomNotificationService;

import MeetingRoomManagementService.MeetingRoomManagementServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import MeetingRoomNotificationService.BookingReminderRequest;
import MeetingRoomNotificationService.BookingReminderResponse;

import java.util.Timer;
import java.util.TimerTask;

public class Service3 extends MeetingRoomNotificationServiceGrpc.MeetingRoomNotificationServiceImplBase {

	private Timer stockTimer;
	private PrinterDevice printer;

	public Service3() {
		printer = new PrinterDevice();
		// set initial stock levels for paper and cartridge
		printer.setStockPaper((int) (Math.random() * 900) + 100); // randomly set between 100-1000
		printer.setStockCartridge((int) (Math.random() * 9) + 1); // randomly set between 1-10

		// schedule a timer task to update the stock levels every 5 seconds
		stockTimer = new Timer();
		stockTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				// update the stock levels
				printer.setStockPaper((int) (Math.random() * 900) + 100); // randomly set between 100-1000
				printer.setStockCartridge((int) (Math.random() * 9) + 1); // randomly set between 100-1000
			}
		}, 0, 5000); // initial delay of 0 seconds, repeat every 5000 milliseconds (5 seconds)
	}

	@Override
	public void deviceSupply(DeviceSupplyRequest request, StreamObserver<DeviceSupplyResponse> responseObserver) {
		// check if paper level is below 300
		boolean alertPaper = printer.getStockPaper() < 500;
		boolean alertCartridge = printer.getStockCartridge() < 5;
		// return a response to the client
		DeviceSupplyResponse response = DeviceSupplyResponse.newBuilder().setSuccess(true)
				.setMessage("Paper quantity is under 300: " + alertPaper)
				.setMessage("Cartridge quantity is under 300: " + alertCartridge).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	public class PrinterDevice {
		private int stockPaper;
		private int stockCartridge;

		public int getStockPaper() {
			return stockPaper;
		}

		public void setStockPaper(int stockPaper) {
			this.stockPaper = stockPaper;
		}

		public int getStockCartridge() {
			return stockCartridge;
		}

		public void setStockCartridge(int stockCartridge) {
			this.stockCartridge = stockCartridge;
		}
	}

	public PrinterDevice getPrinterDevice() {
		return printer;
	}
}
