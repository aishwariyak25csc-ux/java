/*public class day7 {
    static class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving request");
        }

        void reject() {
            System.out.println("Reject request");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }

        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }

    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }

        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }

    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("nafeela", "24-05-2008", "Fever");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("nafeela", "24-05-2008", "Culturals");
        onDutyRequest.rejectOnDutyRequest();
    }
}  */
public class day7 {
    static class payment{
        String amount;

        void transfer(){
            System.out.println("pay");
        }
          static class upipayment extends payment {
              @Override
              void transfer() {
                  System.out.println(" upi payment");


              }
          }
          static class cardpayment extends payment {
              @Override
              void transfer() {
                  System.out.println("cardpayment ");
              }

          }
          static class NBpayment extends payment{
              @Override
              void transfer() {
                  System.out.println("NBpayment");
              }
          }
          static void main(){
              upipayment upipayment=new upipayment();
              upipayment.transfer();

              cardpayment cardpayment=new cardpayment();
              cardpayment.transfer();

              NBpayment NBpayment=new NBpayment();
              NBpayment.transfer();
          }

        }
     }
