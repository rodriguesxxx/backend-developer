**Comandos Utilizados:**
1. **Criação do Deployment:**
   ```bash
   kubectl apply -f deployment.yaml
   ```

2. **Verificação do Status do Deployment e Pods:**
   ```bash
   kubectl get pods
   kubectl get deployments
   ```


**Diferença entre Deployment e Arquivo de Pod:**
- Um arquivo de Pod é mais indicado para casos isolados.
- Um Deployment, por outro lado, é uma abstração de mais alto nível que gerencia pods. Ele permite a definição do número desejado de réplicas. É mais apropriado para ambientes de produção onde é necessário gerenciar aplicativos de forma escalável.
