Eu como usuário administrador;
devo configurar a grade de horário de funcionamento dos almoços;
devo informar exceção de horário caso necessário;
devo cadastrar os refeitórios;
devo informar o tempo limite máximo dos agendamentos para os usuários realizar as refeições;
devo informar o tempo padrão antes do agendamento para liberar o botão check-in;
devo cadastrar usuarios não cadastrado na rede;
devo resetar senhas de usuários quando necessário;

Pré-Condição:
- Acessar o sistema.

1- Eu como administrador;
1.1 - O sistema deve identificar qual usuário é administrador.
1.2 - O sistema deve apresentar acesso de perfil de administrador.
1.3 - O sistema deve apresentar a opção de configuração do sistema.

2 - Devo configurar a grade de horário de funcionamento dos almoços.
2.1 - O sistema deve trazer configurado uma grade default como padrão deia da semana de segunda a sexta-feira, e horário pré-determinado na codificação;
2.2 - O administrador pode alterar as grades de horários cadastradas;
2.3 - O sistema deve permitir a alteração da grade horário e dia da semana;
2.4 - O administrador pode marcar uma grade como padrão para as demais grades;
2.5 - O sistema deve permitir a opção de padronizar uma grade - Hora Início e Hora Final, deixar o campo editavél para alteração;
2.6 - O administrador pode adicionar nova grade de horário;
2.7 - O sistema deve validar se já não tem a grade cadastrada, não permitir cadastrar duas grades com dia da semana, horário inicial e horário final iguais;
2.8 - O administrador só pode excluir uma grade não vinculada a um refeitório;
2.9 - O sistema não deve permitir excluir a grade de horário, que estiver vinculado com um refeitório;
2.10 - O sistema deve dar a opção ao administrador de identificar os refeitórios vinculados, ao tentar excluir a grade de horário;
2.11 - O administrador deve remover o vínculo da grade de horário com o cadastro de refeitório, antes de excluir;


3- Devo cadastrar os refeitórios;
2.1 - O sistema deve pedir as informações para identificar o refeitório;
2.2 - O administrador deve dar um nome de descrição para o refeitório;
2.3 - O status inicial do refeitório deve ser ativo;
2.4 - O administrador deve informar a quantidade de recursos (assentos) tem no refeitório.
2.5 - O administrador deve informar a grade de horário que o refeitório vai usar.


2.3 - O sistema deve validar os campos obrigatórios;
2.4 - O sistema deve gravar 


1.2 - O administrador tem que ter permissão de cadastradar colaboradores.
1.3 - O administrador tem que ter permissão de resetar a senha, caso o colaborador necessitar de uma senha nova.



Eu vou instalar o aplicativo mobile, 
como colaborador registrado na rede, 
poderei acessar o sistema de agendamento,
caso eu não tenha um cadastro na rede, vou solicitar ao administrador o cadastro,
na base de dados do sistema Agendamento, 
vou acessa o aplicativo mobile, escolher uma data.



Pré-Condição:
- O usuário deve instalar o aplicativo mobile;
- O sistema deve oferecer o aplicativo em iOS e Android para donwload;

1- Eu como colaborador registrado na rede terei acesso ao agendamento.
1.1 - O usuário tem que ser cadastrado na rede como colaborador ter um username e senha.
1.2 - O username é composto pelo e-mail e senha fornecido para o acesso a rede.
1.3 - O usuário tem que instalar o aplicativo mobile;
1.4 - O sistema deve oferecer o aplicativo em iOS e Android para donwload;
1.5 - O sistema deve apresentar uma tela de login para o usuário informar username e senha.
1.6 - O sistema deve solicitar login e senha para cada acesso. 
1.7 - O sistema deve identificar os colaboradores registrado na rede pelo seu username.
1.8 - O sistema deve validar o username do login e senha com a senha da rede.
1.9 - O sistema deve informar o usuário que falhar no acesso ao login a procurar o administrador;
1.10 - O sistema deve apresentar a msg: "Não foi possivél acessar com o usuário e senha informado, tente novamente ou procure o administrador!".

2- Caso eu não tenha um cadastro na rede, vou solicitar ao administrador o cadastro na base de dados do sistema Agendamento.
2.1 - O sistema deve ter uma base de dados própria.
2.2 - o usuário deve informar uma senha nova no próximo acesso, quando o administrador resetar a senha do usuário.
2.3 - O sistema deve solicitar o cadastrado de uma nova senha caso usuário não tiver uma senha cadastrada.
2.4 - O sistema deve validar o acesso do usuário, na base local, se o usuário não tiver cadastrado na base de dados da rede principal.
 
3- Eu poderei acessar o sistema de agendamento.
3.1 - O sistema deve apresentar a tela principal;
3-1 - O sistema vai trazer as informações dos refeitórios disponíveis da data atual como padrão;

2.3 - O usuario deve informar usuário e senha;

3- Ao acessar o botão ou link para o agendamento vou ver os refeitórios que estão  para agendamento.
3.1 O usuário administrador deve cadastradar os refeitórios existentes.
3.2 Informar a quantidade de recursos disponíveis 
 
 
 1- Caso o usuário não esteja cadastrado na rede, como ele deve solicitar a senha ao administrador? pessoalmente? por outro sistema? pelo sistema de agendamento?
 2- O usuário que estiver acessado o portal da rede, precisa informar os dados na tela de login do agendamento? ou ele vai ser identificado pelo login atual automaticamente?
