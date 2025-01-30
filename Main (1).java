/*
 String[] terror = {"aaa", "baa", "caa", "daa"};
        String[] l1 = new String[4];
        System.arraycopy(terror, 1, l1, 0, 3);

        
        
        
        System.out.println(Arrays.toString(l1));*/
        
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("<<<BEM VINDO ao sBOOK!>>>");
	    
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
        System.out.println("[1. PROFESSOR]---[2.ALUNO]");
        int hier = sc.nextInt();
        
        //DIFININDO CONDICIONAIS PARA A HIERARQUIA DO USUÁRIO
        if(hier==1){
            System.out.println("Olá professor(a) "+nome+", tudo bem?");
            System.out.println("Vamos montar sua litsta de livros!");
            System.out.println();
            
            //COLETANDO DADOS PARA MONTAR O PERFIL
            System.out.println("Escolha um dos títulos abaixo:");
            System.out.println("[1."+terror[0]+"]-[2."+ficcao[0]+"]-[3."+liter[0]+"]-[4."+drama[0]+"]");
            int op1 = sc.nextInt();
            if(op1==1){
                System.arraycopy(terror, 0, l1,0, 4);
            }    
            else if(op1==2){
                System.arraycopy(ficcao, 0, l1,0, 4);
            }
            else if(op1==3){
                System.arraycopy(liter, 0, l1,0, 4);
            }
            else if(op1==4){
                System.arraycopy(drama, 0, l1,0, 4);
            }
            else{
                System.out.println("OPÇÃO INVÁLIDA!");
            }
            
            
            //MONTANDO SEGUNDO BLOCO DE LIVROS
            System.out.println("Escolha um dos títulos abaixo:");
            System.out.println("[1."+terror[4]+"]-[2."+ficcao[4]+"]-[3."+liter[4]+"]-[4."+drama[4]+"]");
            int op2 = sc.nextInt();
                if(op2==1){
                    System.arraycopy(terror, 4, l2,0, 4);
                }
                else if(op2==2){
                    System.arraycopy(ficcao, 4, l2,0, 4);
                }
                else if(op2==3){
                    System.arraycopy(liter, 4, l2,0, 4);
                }
                else if(op2==4){
                    System.arraycopy(drama, 4, l2,0, 4);
                }
                else{
                    System.out.println("OPÇÃO INVÁLIDA!");
                }
                //MONTANDO SEGUNDO BLOCO DE LIVROS
                System.out.println("Escolha um dos títulos abaixo:");
                System.out.println("[1."+terror[8]+"]-[2."+ficcao[8]+"]-[3."+liter[8]+"]-[4."+drama[8]+"]");
                int op3 = sc.nextInt();
                    if(op3==1){
                        System.arraycopy(terror, 8, l3,0, 4);
                    }
                    else if(op3==2){
                       System.arraycopy(ficcao, 8, l3,0, 4);
                    }
                    else if(op3==3){
                        System.arraycopy(liter, 8, l3,0, 4);
                    }
                    else if(op3==4){
                        System.arraycopy(drama, 8, l3,0, 4);
                    }
                    else{
                        System.out.println("OPÇÃO INVÁLIDA!");
                    }
        }
        else if(hier==2){
            System.out.println("Olá "+nome+", tudo bem?");
            System.out.println("Vamos montar sua litsta de livros!");
            System.out.println();
            
            //COLETANDO DADOS PARA MONTAR O PERFIL
            System.out.println("Escolha um dos títulos abaixo:");
            System.out.println("[1."+terror[0]+"]-[2."+ficcao[0]+"]-[3."+liter[0]+"]-[4."+drama[0]+"]");
            int op1 = sc.nextInt();
            if(op1==1){
                System.arraycopy(terror, 0, l1,0, 4);
            }    
            else if(op1==2){
                System.arraycopy(ficcao, 0, l1,0, 4);
            }
            else if(op1==3){
                System.arraycopy(liter, 0, l1,0, 4);
            }
            else if(op1==4){
                System.arraycopy(drama, 0, l1,0, 4);
            }
            else{
                System.out.println("OPÇÃO INVÁLIDA!");
            }
            
            
            //MONTANDO SEGUNDO BLOCO DE LIVROS
            System.out.println("Escolha um dos títulos abaixo:");
            System.out.println("[1."+terror[4]+"]-[2."+ficcao[4]+"]-[3."+liter[4]+"]-[4."+drama[4]+"]");
            int op2 = sc.nextInt();
                if(op2==1){
                    System.arraycopy(terror, 4, l2,0, 4);
                }
                else if(op2==2){
                    System.arraycopy(ficcao, 4, l2,0, 4);
                }
                else if(op2==3){
                    System.arraycopy(liter, 4, l2,0, 4);
                }
                else if(op2==4){
                    System.arraycopy(drama, 4, l2,0, 4);
                }
                else{
                    System.out.println("OPÇÃO INVÁLIDA!");
                }
                //MONTANDO SEGUNDO BLOCO DE LIVROS
                System.out.println("Escolha um dos títulos abaixo:");
                System.out.println("[1."+terror[8]+"]-[2."+ficcao[8]+"]-[3."+liter[8]+"]-[4."+drama[8]+"]");
                int op3 = sc.nextInt();
                    if(op3==1){
                        System.arraycopy(terror, 8, l3,0, 4);
                    }
                    else if(op3==2){
                       System.arraycopy(ficcao, 8, l3,0, 4);
                    }
                    else if(op3==3){
                        System.arraycopy(liter, 8, l3,0, 4);
                    }
                    else if(op3==4){
                        System.arraycopy(drama, 8, l3,0, 4);
                    }
                    else{
                        System.out.println("OPÇÃO INVÁLIDA!");
                    }
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
        }
        
        System.out.println(Arrays.toString("Recomendamos esta títulos para seu perfil."));
		System.out.println(Arrays.toString(l1));
		System.out.println(Arrays.toString(l2));
		System.out.println(Arrays.toString(l3));
		
		
	}
}