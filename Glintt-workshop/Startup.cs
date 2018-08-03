using Glintt_workshop.DataBase;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection;

namespace Glintt_workshop.Warehouseapi
{
    public class Startup {
        public void ConfigureServices (IServiceCollection services) {
            services.AddDbContext<WarehouseContext> (builder => {
                builder.UseMySql ("server=localhost;uid=root;database=Warehouse");
            });

            services.AddMvc ();
            //faz scan a todas as classes CONTROLLER e identifica-as, e adiciona todas os requisitos para o MVC funcionar
        }
        public void Configure (IApplicationBuilder app, IHostingEnvironment env) {
            if (env.IsDevelopment ()) {
                app.UseDeveloperExceptionPage ();
            }

            app.UseMvcWithDefaultRoute ();

            /*
            using (var conn = new MySqlConnection ()) {
                conn.Open ();
            }
            */

            using (var scope = app.ApplicationServices.
                GetRequiredService<IServiceScopeFactory> ().CreateScope ()) { //Esta factory cria objectos com dependências
                //SeedDummyData (scope.ServiceProvider.GetRequiredService<WarehouseContext> ());
                scope.ServiceProvider.GetRequiredService<WarehouseContext> ().Database.EnsureCreated ();
            }
        }
        /*
        private void SeedDummyData (WarehouseContext ctx) {
            var dummyData = new [] {
                new ProductEntity {
                Code = "11111",
                Name = "Bola de Praia",
                Description = "Bela bola de Praia",
                Price = 10.5m,
                StockMovements = {
                new StockMovementEntity {
                Price = 10.5m,
                Quantity = -2,
                CreatedOn = DateTimeOffset.Now.AddDays (-2),
                CreatedBy = "joao.simoes"
                },
                new StockMovementEntity {
                Price = 9m,
                Quantity = 10,
                CreatedOn = DateTimeOffset.Now.AddDays (-3),
                CreatedBy = "joao.simoes"
                },
                },
                CreatedOn = DateTimeOffset.Now.AddDays (-3),
                CreatedBy = "filipe.silva",
                UpdatedOn = DateTimeOffset.Now.AddMinutes (-32),
                UpdatedBy = "filipe.silva"
                },
                new ProductEntity {
                Code = "22222",
                Name = "Bola de Futebol",
                Description = "Esta bola dá pra fazer coisas fixes",
                Price = 50m,
                CreatedOn = DateTimeOffset.Now.AddDays (-3),
                CreatedBy = "filipe.silva",
                UpdatedOn = DateTimeOffset.Now.AddMinutes (-32),
                UpdatedBy = "filipe.silva"
                }
            };

            foreach (var p in dummyData) {
                ctx.Add (p);
            }

            ctx.SaveChanges ();
            */
    }
}
