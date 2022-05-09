//package metodo_instancia11;
//
//public class Cliente {
//    public String primeiroNome;
//
//
//    public String ultimoNome;
//
//    public String telefone;
//
//
//    public String email;
//
//    public String obterNomeCompleto() {
//        String nomeCompleto = primeiroNome + " " + ultimoNome;
//        return nomeCompleto;
//    }
//
//    public String obterDDD() {
//        String ddd = telefone.substring(0, 2);
//        return ddd;
//    }
//
//    public void setName(String alexandre) {
//    }
//
//    public void setTelefone(String s) {
//    }
//
//    public String getNome() {
//    }
//
//    public String getPrimeiroNome() {
//    }
//
//    public String getUltimoNome() {
//    }
//
//    public static class Metodoinstancia {
//        public static void main(String[] args) {
//            Cliente cliente = new Cliente();
//            cliente.primeiroNome = "rogerio";
//            cliente.ultimoNome = "pires" ;
//            cliente.telefone = "77 99958980";
//            cliente.email = "rogerio@gmail.com";
//
//            Cliente cliente2 = new Cliente();
//            cliente2.primeiroNome = "jp";
//            cliente2.ultimoNome = "silva";
//            cliente2.telefone = "12 34456667";
//            cliente2.email ="jp@gmail.com";
//            System.out.println("Nome cliente: " + cliente.obterNomeCompleto()+", ddd: " + cliente.obterDDD());
//            System.out.println("nome cliente : " + cliente2.obterNomeCompleto() + ",ddd: " + cliente2.obterDDD());
//
//        }
//    }
//}
