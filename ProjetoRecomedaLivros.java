import java.util.*;
public class ProjetoRecomendaLivros
{
	public static void main(String[] args) {
	    System.out.println("<<<BEM VINDO ao sBOOK!>>>");
	    String hier = new String();
	    String op1 = new String();
	    String op2 = new String();
	    String op3 = new String();
	    
	    //DEFININDO LISTA DE LIVROS
	    String[] terror = {"It: A coisa", "O Rei da Terra do Nunca", "A Estrada da Noite", "Carmilla: A Vampira de Karnstein", "O Castelo de Otranto", "Misery: Louca Obsessão", "Era Uma Vez um Coração Partido", "Saboro Cadáver", "Sol da Meia-Noite", "O Reflexo", "O Cemitério", "O Exorcista"};
	    String[] ficcao = {"Fahrenheit 451", "Blade Runner", "O Problema Dos Três Corpos", "Frankenstein", "A Mão Esquerda da Escuridão", "Artemis", "Gearbreakers", "O Último Ancestral", "Do Mesmo Sangue", "Vórtices", "I Robot", "Admirável Mundo Novo"};
	    String[] liter = {"Odisseia E Ilíada", "A Divina Comédia", "Os Lusíadas", "Dom Quixote de la Mancha", "Crime e Castigo", "Dom Casmurro", "Ensaio Sobre a Cegueira", "Romeu E Julieta", "Macunaíma", "Grande Sertão: Veredas", "Memórias Póstumas De Brás Cubas", "A Moreninha"};
	    String[] drama = {"Todas As Suas (Im)Perfeições", "É Assim Que Acaba", "E Não Sobrou Nenhum", "Um de Nós Está Mentindo", "Um Lugar Bem Longe Daqui", "O Duque E Eu: O Livro De Daphne", "Cartas De Amor Aos Mortos", "Assassinato No Expresso Oriente", "A Garota Do Lago", "Hamlet", "O Caçador De Pipas", "Auto Da Compadecida"};
	    
	    //LISTAS DE RECOMENDAÇÃO
	    String[] l1 = new String[4];
	    String[] l2 = new String[4];
	    String[] l3 = new String[4];
	    
	    //RECEBENDO INFORMAÇÕES DO USUÁRIO
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE SEU NOME: ");
        String nome = sc.nextLine();
        do{
        System.out.println("[1. PROFESSOR]---[2.ALUNO]");
        hier = sc.nextLine();
        }while(hier.equals("") || hier.equals(" "));
        
        //DIFININDO CONDICIONAIS PARA A HIERARQUIA DO USUÁRIO
        if(hier.equals("1")){
            System.out.println("Olá professor(a) "+nome+", tudo bem?");
            System.out.println("Vamos montar sua litsta de livros!");
            System.out.println();
            
            //COLETANDO DADOS PARA MONTAR O PERFIL
            System.out.println("Escolha um dos títulos abaixo:");
            do{
                System.out.println("[1."+terror[0]+"]-[2."+ficcao[0]+"]-[3."+liter[0]+"]-[4."+drama[0]+"]");
                op1 = sc.nextLine();
            }while(op1.equals("") || op1.equals(" "));
            
            if(op1.equals("1")){
                System.arraycopy(terror, 0, l1,0, 4);
            }    
            else if(op1.equals("2")){
                System.arraycopy(ficcao, 0, l1,0, 4);
            }
            else if(op1.equals("3")){
                System.arraycopy(liter, 0, l1,0, 4);
            }
            else if(op1.equals("4")){
                System.arraycopy(drama, 0, l1,0, 4);
            }
            else{
                System.out.println("OPÇÃO INVÁLIDA!");
            }
            
            
            //MONTANDO SEGUNDO BLOCO DE LIVROS
            System.out.println("Escolha um dos títulos abaixo:");
            do{
                System.out.println("[1."+terror[4]+"]-[2."+ficcao[4]+"]-[3."+liter[4]+"]-[4."+drama[4]+"]");
                op2 = sc.nextLine();
            }while(op2.equals("")||op2.equals(" "));
            
                if(op2.equals("1")){
                    System.arraycopy(terror, 4, l2,0, 4);
                }
                else if(op2.equals("2")){
                    System.arraycopy(ficcao, 4, l2,0, 4);
                }
                else if(op2.equals("3")){
                    System.arraycopy(liter, 4, l2,0, 4);
                }
                else if(op2.equals("4")){
                    System.arraycopy(drama, 4, l2,0, 4);
                }
                else{
                    System.out.println("OPÇÃO INVÁLIDA!");
                }
                //MONTANDO SEGUNDO BLOCO DE LIVROS
                System.out.println("Escolha um dos títulos abaixo:");
                do{
                    System.out.println("[1."+terror[8]+"]-[2."+ficcao[8]+"]-[3."+liter[8]+"]-[4."+drama[8]+"]");
                    op3 = sc.nextLine();
                }while(op3.equals("") || op3.equals(" "));
                    if(op3.equals("1")){
                        System.arraycopy(terror, 8, l3,0, 4);
                    }
                    else if(op3.equals("2")){
                       System.arraycopy(ficcao, 8, l3,0, 4);
                    }
                    else if(op3.equals("3")){
                        System.arraycopy(liter, 8, l3,0, 4);
                    }
                    else if(op3.equals("4")){
                        System.arraycopy(drama, 8, l3,0, 4);
                    }
                    else{
                        System.out.println("OPÇÃO INVÁLIDA!");
                    }
        
        System.out.println("Recomendamos esta títulos para seu perfil.");
		System.out.println(Arrays.toString(l1));
		System.out.println(Arrays.toString(l2));
		System.out.println(Arrays.toString(l3));
        }
        else if(hier.equals("2")){
            System.out.println("Olá "+nome+", tudo bem?");
            System.out.println("Vamos montar sua litsta de livros!");
            System.out.println();
            
            //COLETANDO DADOS PARA MONTAR O PERFIL
            System.out.println("Escolha um dos títulos abaixo:");
            do{
                System.out.println("[1."+terror[0]+"]-[2."+ficcao[0]+"]-[3."+liter[0]+"]-[4."+drama[0]+"]");
                op1 = sc.nextLine();
            }while(op1.equals("") || op1.equals(" "));
            
            if(op1.equals("1")){
                System.arraycopy(terror, 0, l1,0, 4);
            }    
            else if(op1.equals("2")){
                System.arraycopy(ficcao, 0, l1,0, 4);
            }
            else if(op1.equals("3")){
                System.arraycopy(liter, 0, l1,0, 4);
            }
            else if(op1.equals("4")){
                System.arraycopy(drama, 0, l1,0, 4);
            }
            else{
                System.out.println("OPÇÃO INVÁLIDA!");
            }
            
            
            //MONTANDO SEGUNDO BLOCO DE LIVROS
            System.out.println("Escolha um dos títulos abaixo:");
            do{
                System.out.println("[1."+terror[4]+"]-[2."+ficcao[4]+"]-[3."+liter[4]+"]-[4."+drama[4]+"]");
                op2 = sc.nextLine();
            }while(op2.equals("") || op2.equals(" "));
            
                if(op2.equals("1")){
                    System.arraycopy(terror, 4, l2,0, 4);
                }
                else if(op2.equals("2")){
                    System.arraycopy(ficcao, 4, l2,0, 4);
                }
                else if(op2.equals("3")){
                    System.arraycopy(liter, 4, l2,0, 4);
                }
                else if(op2.equals("4")){
                    System.arraycopy(drama, 4, l2,0, 4);
                }
                else{
                    System.out.println("OPÇÃO INVÁLIDA!");
                }
                //MONTANDO SEGUNDO BLOCO DE LIVROS
                System.out.println("Escolha um dos títulos abaixo:");
                do{
                    System.out.println("[1."+terror[8]+"]-[2."+ficcao[8]+"]-[3."+liter[8]+"]-[4."+drama[8]+"]");
                    op3 = sc.nextLine();
                }while(op1.equals("") || op1.equals(" "));
                
                    if(op3.equals("1")){
                        System.arraycopy(terror, 8, l3,0, 4);
                    }
                    else if(op3.equals("2")){
                       System.arraycopy(ficcao, 8, l3,0, 4);
                    }
                    else if(op3.equals("3")){
                        System.arraycopy(liter, 8, l3,0, 4);
                    }
                    else if(op3.equals("4")){
                        System.arraycopy(drama, 8, l3,0, 4);
                    }
                    else{
                        System.out.println("OPÇÃO INVÁLIDA!");
                    }        
        System.out.println("Recomendamos esta títulos para seu perfil.");
		System.out.println(Arrays.toString(l1));
		System.out.println(Arrays.toString(l2));
		System.out.println(Arrays.toString(l3));
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
        }
        
        
		
		sc.close();
	}
}
