package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import myUtil.ManipulaArquivo;
import tools.ConverteDatas;

/**
 *
 * @author Mateus CohuzEr
 */
public class UI {

    Entrada entrada = new Entrada();
    ControleDeCards controleDeCards = new ControleDeCards();
    int opcao = 0;

    public void case_zero() {
        if (opcao == 0) {
            salvarCard();
            System.out.println("|");
            System.out.println("|  Encerrando o programa\n|  Agradeço a preferencia!");
            System.out.println("=====================================");
            System.exit(0);
        }
    }

    public void printCardAdicionado(Deck deck) {
        controleDeCards.add(deck);
        System.out.println("|\n|   Card Adicionado com sucesso!\n|");
    }

    public void printCardAtualizado(Deck deck_antigo, Deck deck_novo) {
        controleDeCards.atualizar(deck_antigo, deck_novo);
        System.out.println("|\n|   Card Atualizado com sucesso!\n|");
    }

    public int main_menu() {
        System.out.println("=====================================");
        System.out.println("|   [1] - Gerenciamento de Cartas");
        System.out.println("|   [0] - Sair");
        System.out.println("=====================================");
        opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
        return opcao;
    }

    public void telaAdicionarCard() {
        int escopo;
        int escopo_interno;
        int idCard = entrada.lerNumeroInteiro("|   Insira o ID da carta: ");
        Deck deck = controleDeCards.buscar(idCard);
        if (deck == null) {
            deck = new Deck();
            deck.setCard_id(idCard);
            deck.setColecao(entrada.lerString("|   Insira a sigla da coleção da Carta: "));
            deck.setPrice(entrada.lerDouble("|   Insira o preço da Carta: "));
            deck.setR_date(entrada.lerData2("|   Insira a data de lançamento da Carta [dd/MM/aaaa]: "));
            deck.setCard_name(entrada.lerString("|   Nome da Carta: "));
            deck.setEffect(entrada.lerString("|   Efeito/Lore da Carta:"));
            System.out.println("|   Qual o tipo da carta?");
            System.out.println("|   [1] - Monstro");
            System.out.println("|   [2] - Magia");
            System.out.println("|   [3] - Armadilha");
            escopo = entrada.lerNumeroInteiro("|  >>");
            switch (escopo) {
                case 1:
                    deck.setCard_main_type("Monstro");

                    System.out.println("|   Qual o atributo da carta?");
                    System.out.println("|   [1] - Terra");
                    System.out.println("|   [2] - Fogo");
                    System.out.println("|   [3] - Vento");
                    System.out.println("|   [4] - Água");
                    System.out.println("|   [5] - Luz");
                    System.out.println("|   [6] - Trevas");
                    System.out.println("|   [7] - Divino");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            deck.setAttribute("Terra");
                            break;
                        case 2:
                            deck.setAttribute("Fogo");
                            break;
                        case 3:
                            deck.setAttribute("Vento");
                            break;
                        case 4:
                            deck.setAttribute("Água");
                            break;
                        case 5:
                            deck.setAttribute("Luz");
                            break;
                        case 6:
                            deck.setAttribute("Trevas");
                            break;
                        case 7:
                            deck.setAttribute("Divino");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }

                    System.out.println("|   Qual o tipo da carta?");
                    System.out.println("|   [1] - Aqua");
                    System.out.println("|   [2] - Besta");
                    System.out.println("|   [3] - Besta Alada");
                    System.out.println("|   [4] - Besta Divina");
                    System.out.println("|   [5] - Besta Guerreira");
                    System.out.println("|   [6] - Ciberso");
                    System.out.println("|   [7] - Demônio");
                    System.out.println("|   [8] - Deus Criador");
                    System.out.println("|   [9] - Dinossauro");
                    System.out.println("|   [10] - Dragão");
                    System.out.println("|   [11] - Fada");
                    System.out.println("|   [12] - Guerreiro");
                    System.out.println("|   [13] - Inseto");
                    System.out.println("|   [14] - Mago");
                    System.out.println("|   [15] - Máquina");
                    System.out.println("|   [16] - Planta");
                    System.out.println("|   [17] - Peixe");
                    System.out.println("|   [18] - Piro");
                    System.out.println("|   [19] - Psíquico");
                    System.out.println("|   [20] - Réptil");
                    System.out.println("|   [21] - Rocha");
                    System.out.println("|   [22] - Serpente Marinha");
                    System.out.println("|   [23] - Trovão");
                    System.out.println("|   [24] - Wyrm");
                    System.out.println("|   [25] - Zumbi");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            deck.setType("Aqua");
                            break;
                        case 2:
                            deck.setType("Besta");
                            break;
                        case 3:
                            deck.setType("Besta Alada");
                            break;
                        case 4:
                            deck.setType("Besta Divina");
                            break;
                        case 5:
                            deck.setType("Besta Guerreira");
                            break;
                        case 6:
                            deck.setType("Ciberso");
                            break;
                        case 7:
                            deck.setType("Demônio");
                            break;
                        case 8:
                            deck.setType("Deus Criador");
                            break;
                        case 9:
                            deck.setType("Dinossauro");
                            break;
                        case 10:
                            deck.setType("Dragão");
                            break;
                        case 11:
                            deck.setType("Fada");
                            break;
                        case 12:
                            deck.setType("Guerreiro");
                            break;
                        case 13:
                            deck.setType("Inseto");
                            break;
                        case 14:
                            deck.setType("Mago");
                            break;
                        case 15:
                            deck.setType("Máquina");
                            break;
                        case 16:
                            deck.setType("Planta");
                            break;
                        case 17:
                            deck.setType("Peixe");
                            break;
                        case 18:
                            deck.setType("Piro");
                            break;
                        case 19:
                            deck.setType("Psíquico");
                            break;
                        case 20:
                            deck.setType("Réptil");
                            break;
                        case 21:
                            deck.setType("Rocha");
                            break;
                        case 22:
                            deck.setType("Serpente Marinha");
                            break;
                        case 23:
                            deck.setType("Trovão");
                            break;
                        case 24:
                            deck.setType("Wyrm");
                            break;
                        case 25:
                            deck.setType("Zumbi");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }

                    System.out.println("|   Qual o subtipo da carta?");
                    System.out.println("|   [1] - Não tem");
                    System.out.println("|   [2] - Gêmeos");
                    System.out.println("|   [3] - Espírito");
                    System.out.println("|   [4] - Toon");
                    System.out.println("|   [5] - Regulador");
                    System.out.println("|   [6] - Union");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            break;
                        case 2:
                            deck.setType(deck.getType() + " Gêmeos");
                            break;
                        case 3:
                            deck.setType(deck.getType() + " Espírito");
                            break;
                        case 4:
                            deck.setType(deck.getType() + " Toon");
                            break;
                        case 5:
                            deck.setType(deck.getType() + " Regulador");
                            break;
                        case 6:
                            deck.setType(deck.getType() + " Union");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }

                    System.out.println("|   Qual o subtipo da carta?");
                    System.out.println("|   [1] - Normal");
                    System.out.println("|   [2] - Efeito");
                    System.out.println("|   [3] - Ritual");
                    System.out.println("|   [4] - Fusão");
                    System.out.println("|   [5] - Synchro");
                    System.out.println("|   [6] - XYZ");
                    System.out.println("|   [7] - Pêndulo");
                    System.out.println("|   [8] - Link");
                    escopo = entrada.lerNumeroInteiro("|  >>");
                    switch (escopo) {
                        case 1:
                            deck.setCard_sub_type("Normal");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 2:
                            deck.setCard_sub_type("Efeito");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 3:
                            deck.setCard_sub_type("Ritual");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 4:
                            deck.setCard_sub_type("Fusão");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 5:
                            deck.setCard_sub_type("Synchro");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 0 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 6:
                            deck.setCard_sub_type("XYZ");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o rank do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM RANK VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 7:
                            deck.setCard_sub_type("Pêndulo");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 0 && escopo_interno <= 13) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            int[] escopo_pend_scale;
                            escopo_pend_scale = new int[2];
                            for (int i = 0; i < 2; i++) {
                                escopo_pend_scale[i] = entrada.lerNumeroInteiro("|   Insira a escala " + i + " do Monstro:");
                            }
                            deck.setPendulum_scale(escopo_pend_scale);
                            deck.setPendulum_effect(entrada.lerString("|   Efeito Pêndulo do Monstro: "));
                            break;
                        case 8:
                            deck.setCard_sub_type("Link");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o nivel de Link do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 6) {
                                    deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LINK LEVEL VALIDO<");
                                }
                            }
                            deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }
                    printCardAdicionado(deck);
                    break;

                case 2:
                    deck.setCard_main_type("Magia");

                    System.out.println("|   Qual o tipo de Magia?");
                    System.out.println("|   [1] - Normal");
                    System.out.println("|   [2] - Equipamento");
                    System.out.println("|   [3] - Ritual");
                    System.out.println("|   [4] - Rápida (Quickplay)");
                    System.out.println("|   [5] - Continua");
                    System.out.println("|   [6] - De Campo");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            deck.setCard_sub_type("Normal");
                            break;
                        case 2:
                            deck.setCard_sub_type("Equipamento");
                            break;
                        case 3:
                            deck.setCard_sub_type("Ritual");
                            break;
                        case 4:
                            deck.setCard_sub_type("Rápida (Quickplay)");
                            break;
                        case 5:
                            deck.setCard_sub_type("Continua");
                            break;
                        case 6:
                            deck.setCard_sub_type("De campo");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }
                    printCardAdicionado(deck);
                    break;
                case 3:
                    deck.setCard_main_type("Armadilha");

                    System.out.println("|   Qual o tipo de Magia?");
                    System.out.println("|   [1] - Normal");
                    System.out.println("|   [2] - Continua");
                    System.out.println("|   [3] - De Resposta (Counter)");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            deck.setCard_sub_type("Normal");
                            break;
                        case 2:
                            deck.setCard_sub_type("Continua");
                            break;
                        case 3:
                            deck.setCard_sub_type("De Resposta (Counter)");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }
                    printCardAdicionado(deck);
                default:
                    System.out.println("|   Operação cancelada, tente novamente");
                    if (opcao != 1 && opcao != 2 && opcao != 3) {
                        System.out.println("\n > Insira uma opção valida < \n");
                        opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                    }
            }
        } else {
            System.out.println("|\n|   Card já cadastrado!\n|");
        }
    }

    public void telaListarCard() {
        List<Deck> lista_cards = controleDeCards.listar();
        if (lista_cards.size() > 0) {
            for (int i = 0; i < lista_cards.size(); i++) {
                System.out.println("|   " + lista_cards.get(i).toString());
            }
        } else {
            System.out.println("|");
            System.out.println("|   Sem cartas catalogadas no momento");
            System.out.println("|");
        }
    }

    public void telaBuscarCard() {
        int idCard = entrada.lerNumeroInteiro("|   Insira o ID do card a ser procurado: ");
        Deck target_card = controleDeCards.buscar(idCard);
        if (target_card == null) {
            System.out.println("|\n|   Card não cadastrado\n|");
        } else {
            System.out.println(target_card.toString());
        }
    }

    private void telaAlterarCard() {
        int idCard = entrada.lerNumeroInteiro("|   ID do card a ser alterado:");
        Deck target_card = controleDeCards.buscar(idCard);
        if (target_card == null) {
            System.out.println("|   Card não cadastrado");
        } else {
            System.out.println("|\n|   Card Encontrado - Pronto para atualização\n|");
            Deck new_target_deck = new Deck();
            new_target_deck.setCard_id(idCard);
            new_target_deck.setColecao(entrada.lerString("|   Insira a sigla da coleção da Carta: "));
            new_target_deck.setPrice(entrada.lerDouble("|   Insira o preço da Carta: "));
            new_target_deck.setR_date(entrada.lerData2("|   Insira a data de lançamento da Carta [dd/MM/aaaa]: "));
            new_target_deck.setCard_name(entrada.lerString("|   Nome da Carta: "));
            new_target_deck.setEffect(entrada.lerString("|   Efeito/Lore da Carta:"));
            System.out.println("|   Qual o tipo da carta?");
            System.out.println("|   [1] - Monstro");
            System.out.println("|   [2] - Magia");
            System.out.println("|   [3] - Armadilha");
            int escopo = entrada.lerNumeroInteiro("|  >>");
            int escopo_interno;
            switch (escopo) {
                case 1:
                    new_target_deck.setCard_main_type("Monstro");
                    System.out.println("|   Qual o atributo da carta?");
                    System.out.println("|   [1] - Terra");
                    System.out.println("|   [2] - Fogo");
                    System.out.println("|   [3] - Vento");
                    System.out.println("|   [4] - Água");
                    System.out.println("|   [5] - Luz");
                    System.out.println("|   [6] - Trevas");
                    System.out.println("|   [7] - Divino");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            new_target_deck.setAttribute("Terra");
                            break;
                        case 2:
                            new_target_deck.setAttribute("Fogo");
                            break;
                        case 3:
                            new_target_deck.setAttribute("Vento");
                            break;
                        case 4:
                            new_target_deck.setAttribute("Água");
                            break;
                        case 5:
                            new_target_deck.setAttribute("Luz");
                            break;
                        case 6:
                            new_target_deck.setAttribute("Trevas");
                            break;
                        case 7:
                            new_target_deck.setAttribute("Divino");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }

                    System.out.println("|   Qual o tipo da carta?");
                    System.out.println("|   [1] - Aqua");
                    System.out.println("|   [2] - Besta");
                    System.out.println("|   [3] - Besta Alada");
                    System.out.println("|   [4] - Besta Divina");
                    System.out.println("|   [5] - Besta Guerreira");
                    System.out.println("|   [6] - Ciberso");
                    System.out.println("|   [7] - Demônio");
                    System.out.println("|   [8] - Deus Criador");
                    System.out.println("|   [9] - Dinossauro");
                    System.out.println("|   [10] - Dragão");
                    System.out.println("|   [11] - Fada");
                    System.out.println("|   [12] - Guerreiro");
                    System.out.println("|   [13] - Inseto");
                    System.out.println("|   [14] - Mago");
                    System.out.println("|   [15] - Máquina");
                    System.out.println("|   [16] - Planta");
                    System.out.println("|   [17] - Peixe");
                    System.out.println("|   [18] - Piro");
                    System.out.println("|   [19] - Psíquico");
                    System.out.println("|   [20] - Réptil");
                    System.out.println("|   [21] - Rocha");
                    System.out.println("|   [22] - Serpente Marinha");
                    System.out.println("|   [23] - Trovão");
                    System.out.println("|   [24] - Wyrm");
                    System.out.println("|   [25] - Zumbi");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            new_target_deck.setType("Aqua");
                            break;
                        case 2:
                            new_target_deck.setType("Besta");
                            break;
                        case 3:
                            new_target_deck.setType("Besta Alada");
                            break;
                        case 4:
                            new_target_deck.setType("Besta Divina");
                            break;
                        case 5:
                            new_target_deck.setType("Besta Guerreira");
                            break;
                        case 6:
                            new_target_deck.setType("Ciberso");
                            break;
                        case 7:
                            new_target_deck.setType("Demônio");
                            break;
                        case 8:
                            new_target_deck.setType("Deus Criador");
                            break;
                        case 9:
                            new_target_deck.setType("Dinossauro");
                            break;
                        case 10:
                            new_target_deck.setType("Dragão");
                            break;
                        case 11:
                            new_target_deck.setType("Fada");
                            break;
                        case 12:
                            new_target_deck.setType("Guerreiro");
                            break;
                        case 13:
                            new_target_deck.setType("Inseto");
                            break;
                        case 14:
                            new_target_deck.setType("Mago");
                            break;
                        case 15:
                            new_target_deck.setType("Máquina");
                            break;
                        case 16:
                            new_target_deck.setType("Planta");
                            break;
                        case 17:
                            new_target_deck.setType("Peixe");
                            break;
                        case 18:
                            new_target_deck.setType("Piro");
                            break;
                        case 19:
                            new_target_deck.setType("Psíquico");
                            break;
                        case 20:
                            new_target_deck.setType("Réptil");
                            break;
                        case 21:
                            new_target_deck.setType("Rocha");
                            break;
                        case 22:
                            new_target_deck.setType("Serpente Marinha");
                            break;
                        case 23:
                            new_target_deck.setType("Trovão");
                            break;
                        case 24:
                            new_target_deck.setType("Wyrm");
                            break;
                        case 25:
                            new_target_deck.setType("Zumbi");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }

                    System.out.println("|   Qual o subtipo da carta?");
                    System.out.println("|   [1] - Não tem");
                    System.out.println("|   [2] - Gêmeos");
                    System.out.println("|   [3] - Espírito");
                    System.out.println("|   [4] - Toon");
                    System.out.println("|   [5] - Regulador");
                    System.out.println("|   [6] - Union");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            break;
                        case 2:
                            new_target_deck.setType(new_target_deck.getType() + " Gêmeos");
                            break;
                        case 3:
                            new_target_deck.setType(new_target_deck.getType() + " Espírito");
                            break;
                        case 4:
                            new_target_deck.setType(new_target_deck.getType() + " Toon");
                            break;
                        case 5:
                            new_target_deck.setType(new_target_deck.getType() + " Regulador");
                            break;
                        case 6:
                            new_target_deck.setType(new_target_deck.getType() + " Union");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }

                    System.out.println("|   Qual o subtipo da carta?");
                    System.out.println("|   [1] - Normal");
                    System.out.println("|   [2] - Efeito");
                    System.out.println("|   [3] - Ritual");
                    System.out.println("|   [4] - Fusão");
                    System.out.println("|   [5] - Synchro");
                    System.out.println("|   [6] - XYZ");
                    System.out.println("|   [7] - Pêndulo");
                    System.out.println("|   [8] - Link");
                    escopo = entrada.lerNumeroInteiro("|  >>");
                    switch (escopo) {
                        case 1:
                            new_target_deck.setCard_sub_type("Normal");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 2:
                            new_target_deck.setCard_sub_type("Efeito");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 3:
                            new_target_deck.setCard_sub_type("Ritual");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 4:
                            new_target_deck.setCard_sub_type("Fusão");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 5:
                            new_target_deck.setCard_sub_type("Synchro");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 0 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 6:
                            new_target_deck.setCard_sub_type("XYZ");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o rank do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM RANK VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            break;
                        case 7:
                            new_target_deck.setCard_sub_type("Pêndulo");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o level do monstro: ");
                                if (escopo_interno >= 0 && escopo_interno <= 13) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            new_target_deck.setDef(entrada.lerNumeroInteiro("|   Insira a Defesa do monstro: "));
                            int[] escopo_pend_scale;
                            escopo_pend_scale = new int[2];
                            for (int i = 0; i < 2; i++) {
                                escopo_pend_scale[i] = entrada.lerNumeroInteiro("|   Insira a escala " + i + " do Monstro:");
                            }
                            new_target_deck.setPendulum_scale(escopo_pend_scale);
                            new_target_deck.setPendulum_effect(entrada.lerString("|   Efeito Pêndulo do Monstro: "));
                            break;
                        case 8:
                            new_target_deck.setCard_sub_type("Link");
                            while (true) {
                                escopo_interno = entrada.lerNumeroInteiro("|   Insira o nivel de Link do monstro: ");
                                if (escopo_interno >= 1 && escopo_interno <= 6) {
                                    new_target_deck.setLevel_rank_link(escopo_interno);
                                    break;
                                } else {
                                    System.out.println("|   >DIGITE UM LINK LEVEL VALIDO<");
                                }
                            }
                            new_target_deck.setAtk(entrada.lerNumeroInteiro("|   Insira o Ataque do monstro: "));
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }
                    printCardAtualizado(target_card, new_target_deck);
                    break;

                case 2:
                    new_target_deck.setCard_main_type("Magia");

                    System.out.println("|   Qual o tipo de Magia?");
                    System.out.println("|   [1] - Normal");
                    System.out.println("|   [2] - Equipamento");
                    System.out.println("|   [3] - Ritual");
                    System.out.println("|   [4] - Rápida (Quickplay)");
                    System.out.println("|   [5] - Continua");
                    System.out.println("|   [6] - De Campo");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            new_target_deck.setCard_sub_type("Normal");
                            break;
                        case 2:
                            new_target_deck.setCard_sub_type("Equipamento");
                            break;
                        case 3:
                            new_target_deck.setCard_sub_type("Ritual");
                            break;
                        case 4:
                            new_target_deck.setCard_sub_type("Rápida (Quickplay)");
                            break;
                        case 5:
                            new_target_deck.setCard_sub_type("Continua");
                            break;
                        case 6:
                            new_target_deck.setCard_sub_type("De campo");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }
                    printCardAtualizado(target_card, new_target_deck);
                    break;
                case 3:
                    new_target_deck.setCard_main_type("Armadilha");

                    System.out.println("|   Qual o tipo de Magia?");
                    System.out.println("|   [1] - Normal");
                    System.out.println("|   [2] - Continua");
                    System.out.println("|   [3] - De Resposta (Counter)");
                    escopo = entrada.lerNumeroInteiro("|   >>");
                    switch (escopo) {
                        case 1:
                            new_target_deck.setCard_sub_type("Normal");
                            break;
                        case 2:
                            new_target_deck.setCard_sub_type("Continua");
                            break;
                        case 3:
                            new_target_deck.setCard_sub_type("De Resposta (Counter)");
                            break;
                        default:
                            System.out.println("\n > Insira uma opção valida < \n");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            break;
                    }
                    printCardAtualizado(target_card, new_target_deck);
                default:
                    System.out.println("|   Operação cancelada, tente novamente");
                    if (opcao != 1 && opcao != 2 && opcao != 3) {
                        System.out.println("\n > Insira uma opção valida < \n");
                        opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                    }
            }
        }
    }

    public void telaExcluirCard() {
        int idCard = entrada.lerNumeroInteiro("|    ID do Card: ");
        Deck target_card = controleDeCards.buscar(idCard);
        if (target_card == null) {
            System.out.println("|\n|   Card NÃO CADASTRADO\n|");
        } else {
            System.out.println("|\n|   Card Encontrado - Pronto para ser Excluido\n");
            controleDeCards.excluir(target_card);
            System.out.println("|\n|   Card excluido com sucesso\n|");
        }
    }

    public void salvarCard() {
        List<String> l_string = new ArrayList<>();
        List<Deck> l_cards = controleDeCards.listar();
        for (int i = 0; i < l_cards.size(); i++) {
            l_string.add(l_cards.get(i).toString());
            l_string.add("\n");
        }
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        manipulaArquivo.salvarArquivo("Cards.csv", l_string);
        System.out.println("|\n|   Save Executado\n|");
    }

    public void carregaSave() {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        if (manipulaArquivo.existeOArquivo("Cards.csv")) {
            List<String> l_string = manipulaArquivo.abrirArquivo("Cards.csv");
            for (String ll : l_string) {
                String aux[] = ll.split(";");
                Deck card = new Deck();
                ConverteDatas converteDatas = new ConverteDatas();
                if (aux[2].equals("Monstro")) {
                    if (aux[3].equals("Link")) {
                        card.setCard_name(aux[0]);
                        card.setCard_id(Integer.valueOf(aux[1]));
                        card.setCard_main_type(aux[2]);
                        card.setCard_sub_type(aux[3]);
                        card.setLevel_rank_link(Integer.valueOf(aux[4]));
                        card.setAtk(Integer.valueOf(aux[5]));
                        card.setEffect(aux[6]);
                        card.setType(aux[7]);
                        card.setAttribute(aux[8]);
                        card.setR_date(converteDatas.converteDeStringParaDate(aux[9]));
                        card.setColecao(aux[10]);
                        card.setPrice(Double.valueOf(aux[11]));
                    } else if (aux[3].equals("Pêndulo")) {
                        card.setCard_name(aux[0]);
                        card.setCard_id(Integer.valueOf(aux[1]));
                        card.setCard_main_type(aux[2]);
                        card.setCard_sub_type(aux[3]);
                        card.setLevel_rank_link(Integer.valueOf(aux[4]));
                        card.setAtk(Integer.valueOf(aux[5]));
                        card.setDef(Integer.valueOf(aux[6]));
                        card.setEffect(aux[7]);
                        card.setType(aux[8]);
                        card.setAttribute(aux[9]);
                        int[] escopo = {Integer.valueOf(aux[10]), Integer.valueOf(aux[11])};
                        card.setPendulum_scale(escopo);
                        card.setPendulum_effect(aux[12]);
                        card.setR_date(converteDatas.converteDeStringParaDate(aux[13]));
                        card.setColecao(aux[14]);
                        card.setPrice(Double.valueOf(aux[15]));
                    } else {
                        card.setCard_name(aux[0]);
                        card.setCard_id(Integer.valueOf(aux[1]));
                        card.setCard_main_type(aux[2]);
                        card.setCard_sub_type(aux[3]);
                        card.setLevel_rank_link(Integer.valueOf(aux[4]));
                        card.setAtk(Integer.valueOf(aux[5]));
                        card.setDef(Integer.valueOf(aux[6]));
                        card.setEffect(aux[7]);
                        card.setType(aux[8]);
                        card.setAttribute(aux[9]);
                        card.setR_date(converteDatas.converteDeStringParaDate(aux[10]));
                        card.setColecao(aux[11]);
                        card.setPrice(Double.valueOf(aux[12]));
                    }
                } else if (aux[2].equals("Magia")) {
                    card.setCard_name(aux[0]);
                    card.setCard_id(Integer.valueOf(aux[1]));
                    card.setCard_main_type(aux[2]);
                    card.setCard_sub_type(aux[3]);
                    card.setEffect(aux[4]);
                    card.setR_date(converteDatas.converteDeStringParaDate(aux[5]));
                    card.setColecao(aux[6]);
                    card.setPrice(Double.valueOf(aux[7]));
                } else if (aux[2].equals("Armadilha")) {
                    card.setCard_name(aux[0]);
                    card.setCard_id(Integer.valueOf(aux[1]));
                    card.setCard_main_type(aux[2]);
                    card.setCard_sub_type(aux[3]);
                    card.setEffect(aux[4]);
                    card.setR_date(converteDatas.converteDeStringParaDate(aux[5]));
                    card.setColecao(aux[6]);
                    card.setPrice(Double.valueOf(aux[7]));
                }
                controleDeCards.add(card);
            }
        }
    }

    private void verCardAleatorio() {
        List<Deck> lista = controleDeCards.listar();
        if (!lista.isEmpty()) {
            Random random = new Random();
            int[] ids = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                ids[i] = lista.get(i).getCard_id();
            }
            int idCard = random.nextInt(ids.length);
            Deck target_card = controleDeCards.buscar(ids[idCard]);
            System.out.println(target_card.toString());
        } else {
            System.out.println("|\n|   SEM CARTAS CATALOGADAS\n|");
        }
    }

    public UI() {
        boolean voltando_tuner = false;
        while (true) {
            carregaSave();
            opcao = main_menu();
            switch (opcao) {
                case 1:
                    if (opcao == 1) {
                        while (true) {
                            System.out.println("|   [1] - Adicionar Carta ao Catalogo");
                            System.out.println("|   [2] - Listar Cartas");
                            System.out.println("|   [3] - Buscar Carta");
                            System.out.println("|   [4] - Alterar Carta");
                            System.out.println("|   [5] - Excluir Carta");
                            System.out.println("|   [6] - Carta Aleatória");
                            System.out.println("|   [8] - Salvar");
                            System.out.println("|   [9] - Voltar");
                            System.out.println("|   [0] - Sair");
                            opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                            switch (opcao) {
                                case 1:
                                    telaAdicionarCard();
                                    salvarCard();
                                    break;
                                case 2:
                                    telaListarCard();
                                    break;
                                case 3:
                                    telaBuscarCard();
                                    break;
                                case 4:
                                    telaAlterarCard();
                                    salvarCard();
                                    break;
                                case 5:
                                    telaExcluirCard();
                                    salvarCard();
                                    break;
                                case 6:
                                    verCardAleatorio();
                                    break;
                                case 8:
                                    salvarCard();
                                    break;
                                case 9:
                                    System.out.println("|");
                                    System.out.println("|   << Voltando");
                                    System.out.println("|");
                                    voltando_tuner = true;
                                    break;
                                case 0:
                                    case_zero();
                                default:
                                    System.out.println("|\n > Insira uma opção valida < \n|");
                                    opcao = entrada.lerNumeroInteiro("| >> Escolha uma opção: ");
                                    break;
                            }
                            if (voltando_tuner) {
                                break;
                            }
                        }
                    }
                case 0:
                    case_zero();
                default:
                    if (!voltando_tuner) {
                        System.out.println("|");
                        System.out.println("| Opção invalida! Insira uma opção valida");
                        System.out.println("|");
                    }
            }
        }
    }
}
