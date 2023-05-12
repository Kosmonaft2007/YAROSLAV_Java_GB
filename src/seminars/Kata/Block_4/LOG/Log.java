//public static class UntrustworthyMailWorker implements MailService {
//    private final RealMailService realMailService = new RealMailService();
//    private MailService[] mailServices;
//
//    public UntrustworthyMailWorker(MailService[] services) {
//        mailServices = services;
//    }
//
//    public MailService getRealMailService() {
//        return realMailService;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        Sendable processed = mail;
//        for (int i = 0; i < mailServices.length; i++) {
//            processed = mailServices[i].processMail(processed);
//        }
//        return realMailService.processMail(processed);
//    }
//}
//
//public static class Spy implements MailService {
//    private Logger LOGGER;
//
//    public Spy(Logger logger) {
//        LOGGER = logger;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if (mail.getClass() == MailMessage.class) {
//            MailMessage mailMessage = (MailMessage) mail;
//            String from = mailMessage.getFrom();
//            String to = mailMessage.getTo();
//            if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
//                LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
//            } else {
//                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");
//            }
//        }
//        return mail;
//    }
//}
//
//public static class Thief implements MailService {
//    private int minPrice = 0;
//    private int stolenPrice = 0;
//
//    public Thief(int minPrice) {
//        this.minPrice = minPrice;
//    }
//
//    public int getStolenValue() {
//        return stolenPrice;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if (mail.getClass() == MailPackage.class) {
//            Package pac = ((MailPackage) mail).getContent();
//            if (pac.getPrice() >= minPrice) {
//                stolenPrice += pac.getPrice();
//                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pac.getContent(), 0));
//            }
//        }
//        return mail;
//    }
//}
//
//public static class IllegalPackageException extends RuntimeException {
//}
//
//public static class StolenPackageException extends RuntimeException {
//}
//
//public static class Inspector implements MailService {
//    private static final String[] ILLEGAL_CONTENT =
//            new String[]{WEAPONS, BANNED_SUBSTANCE};
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if (mail instanceof MailPackage) {
//            MailPackage mailPackage = (MailPackage) mail;
//            if (mailPackage.getContent().getContent().contains("stones")) {
//                throw new StolenPackageException();
//            }
//            for (String illegalString : ILLEGAL_CONTENT) {
//                if (mailPackage.getContent().getContent().contains(illegalString)) {
//                    throw new IllegalPackageException();
//                }
//            }
//        }
//        return mail;
//    }
//}