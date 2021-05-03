public class IpAddress {
    private String _getDottedDecimal;
    private int _firstOctet, _secondOctet, _thirdOctet, _forthOctet;

    public IpAddress(String ip) {
        _getDottedDecimal = ip;

        String tempIP = ip + ".";
        String octet = "";
        int i = 0;

        while (tempIP.indexOf(".") != -1) {
            octet = tempIP.substring(0, tempIP.indexOf("."));
            tempIP = tempIP.substring(tempIP.indexOf(".") + 1);
            
            int subOctet = Integer.parseInt(octet);

                switch(i)
                {
                    case 0:{
                        _firstOctet = subOctet;
                        break;
                    }
                    case 1:{
                        _secondOctet = subOctet;
                        break;
                    }
                    case 2:{
                        _thirdOctet = subOctet;
                        break;
                    }
                    case 3:{
                        _forthOctet = subOctet;
                        break;
                    }
                }
                i++;
        }
    }

    public String getDottedDecimal(){
        return _getDottedDecimal;
    }

    public int getOctet(int index) {
        switch(index){
            case 1: return _firstOctet;
            case 2: return _secondOctet;
            case 3: return _thirdOctet;
            case 4: return _forthOctet;
        }
        System.err.println("Incorrent position of the octet: (1, 2, 3 or 4)");
        return -1;
    }
}
